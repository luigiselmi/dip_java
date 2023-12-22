import ij.ImagePlus;
import ij.plugin.filter.PlugInFilter;
import ij.process.ImageProcessor;


public class Compute_Histogram implements PlugInFilter {

 public int setup(String arg, ImagePlus img) {
   return DOES_8G + NO_CHANGES;
 }

 public void run(ImageProcessor ip) {
   int[] h = new int[256]; // histogram array
   int width = ip.getWidth();
   int height = ip.getHeight();

   for (int v = 0; v < height; v++) {
     for (int u = 0; u < width; u++) {
       int i = ip.getPixel(u, v);
       h[i] = h[i] + 1;
     }
   }
 // ... histogram h can now be used
 }
}
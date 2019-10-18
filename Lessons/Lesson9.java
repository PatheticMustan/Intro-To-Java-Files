public class Lesson9 {
   public static void main (String[] args) {
      double radius = 990.141626;
      // A = pi(r*r)
      double area = Math.PI * (radius * radius);
      
      
      
      System.out.println(radius + " => " + area + "\n");
      // Formats radius to 5 places and 1 decimal place, and area to 10 places and 1 decimal place.
      System.out.printf("%5.1f => %10.1f\n", radius, area);
      System.out.print("Finished!\n");
      
      /*
       * System.out.println prints text, then prints a "\n".
       * System.out.printf formats text, but does NOT print a "\n" afterwards.
       * System.out.print just prints text, no formatting or "\n".
       * 
       * System.out.println prints text, then prints a newline.
       * System.out.printf formats text, but does NOT print a newline afterwards.
       * System.out.print just prints text, no formatting or newline.
       * 
       *           |---------|--------|-------|
       *           | println | printf | print |
       * |---------|---------|--------|-------|
       * | formats |         |   X    |       |
       * |---------|---------|--------|-------|
       * | newline |    X    |        |       |
       * |---------|---------|--------|-------|
       * | prints  |    X    |   X    |   X   |
       * |---------|---------|--------|-------|
       * 
       *                           /|||\
       *                           |||@|\
       *                           ||||||=*===
       *                           ||||||=====     "quack quack"
       *                ______    /|||||/               - Rubber Duck
       *              ----|||||||||||||/
       *         \||||||%%%%%%%%%%%%%|/
       *           \|||||%%%%%%%%%%%|/
       *              \|||||%%%%%|||/
       *               \|||||||||||/
       *                  \-------/
       */
   }
}
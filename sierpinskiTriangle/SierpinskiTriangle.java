import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class SierpinskiTriangle{
	static int size;
	static BufferedImage img;
	static int drawPixel;
	static int backPixel;

	public static void draw(int x, int y, int dist){
		if(dist < 2)return;
		else{
			for(int i=x;i<(x+dist/2);i++){
				for(int j=y+dist/2;j<y+dist;j++) img.setRGB(i, j, drawPixel);
			}
			draw(x,y,dist/2);
			draw(x+dist/2,y,dist/2);
			draw(x+dist/2,y+dist/2,dist/2);
		}
	}

	public static void main(String[] args) {
		if(args.length < 1 || args[0]==null || Integer.parseInt(args[0])<1){
			System.out.println("Argument expected: size > 0 \n\nScript ended");
			System.exit(0);
		}

		size = 2 << (Integer.parseInt(args[0])-1);
		drawPixel = (255<<16) | (255<<8) | 255;
		backPixel = (0<<16) | (0<<8) | 0;
		img = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		
		for (int i=0;i<size;i++){
			for (int j=0;j<size;j++) img.setRGB(i, j, backPixel);
		}

		draw(0,0,size);
		
		try{
			File f = new File("Sierpinski.png");
  			ImageIO.write(img, "png", f);
			}catch(IOException e){e.printStackTrace();}
	}
}
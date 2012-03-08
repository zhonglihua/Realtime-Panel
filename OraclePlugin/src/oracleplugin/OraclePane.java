package oracleplugin;


import javafx.embed.swt.FXCanvas;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import realoracle.Main;


/**
 * 加载javafx2.1的面板图
 */

/**
 * @author yili.yi
 *
 * 下午1:40:35
 */
public class OraclePane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());
        FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
        Main realOralce = new Main();
        canvas.setScene(realOralce.getScene());
        Image image = new Image(display,"images/se_.gif");
        shell.setText(realOralce.getTitle());
        shell.setImage(image);
        shell.open();
        int width = (int) Math.round(realOralce.getWidth());
        int height = (int) Math.round(realOralce.getHeight());
        System.out.println(width +" , "+ height);
        shell.setSize(width,height);//窗口大小
        shell.setLocation(0, 0);//窗口坐标
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
	}
	
	public static Shell showOracle(){
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setLayout(new FillLayout());
        FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
        Main realOralce = new Main();
        canvas.setScene(realOralce.getScene());
        Image image = new Image(display,"images/se_.gif");
        shell.setText(realOralce.getTitle());
        shell.setImage(image);
        shell.open();
        int width = (int) Math.round(realOralce.getWidth());
        int height = (int) Math.round(realOralce.getHeight());
        System.out.println(width +" , "+ height);
        shell.setSize(width,height);//窗口大小
        shell.setLocation(0, 0);//窗口坐标
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
        return shell;
	}

}

package oracleplugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String str = layout.getEditorArea();
		layout.addView("oraclePlugin.PaneView", IPageLayout.LEFT, 50f, str);
	}
}

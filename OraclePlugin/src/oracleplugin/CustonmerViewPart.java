/**
 * 
 */
package oracleplugin;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

/**
 * @author yili.yi
 *
 * œ¬ŒÁ2:45:12
 */
public class CustonmerViewPart extends ViewPart {

	public CustonmerViewPart(){
		super();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		Label labe = new Label(parent,SWT.ALL);
		labe.setText("≤‚ ‘");
//		OraclePane.showOracle();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}

/*         ====================================================
*          # Name: Teresa Potts (POTTST1)
*          # Date: 3/25/14
*          # Course Name: CITP 290
*          # Description: 
*          ====================================================
*
*
*/

package pottst1Prototype.GUI;

import javax.swing.*;
import java.awt.*;

public class SalesOrderPanel extends JPanel
{

	public SalesOrderPanel()

	{

		this.setLayout(new GridLayout(7, 3));

		this.add(new JPanel());

		//Add button section
		JPanel buttonPanel = new JPanel();
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new SalesOrderPanelListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(addButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton removeButton = new JButton("Remove");
		removeButton.addActionListener(new SalesOrderPanelListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(removeButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton finishButton = new JButton("Finish");
		finishButton.addActionListener(new SalesOrderPanelListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(finishButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton managementButton = new JButton("Management");
		managementButton.addActionListener(new SalesOrderPanelListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(managementButton);
		this.add(buttonPanel);

		buttonPanel = new JPanel();
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new SalesOrderPanelListener());
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(exitButton);
		this.add(buttonPanel);
	}

}

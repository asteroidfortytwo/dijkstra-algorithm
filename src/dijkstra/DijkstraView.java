/*
 * DijkstraView.java
 */

package dijkstra;

import org.jdesktop.application.Action;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class DijkstraView extends FrameView {

    public DijkstraView(SingleFrameApplication app) {
        super(app);
        initComponents();
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = DijkstraApp.getApplication().getMainFrame();
            aboutBox = new DijkstraAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        DijkstraApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnButton = new javax.swing.JPanel();
        btnNode = new javax.swing.JButton();
        btnEdge = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        btnStep = new javax.swing.JButton();
        btnSolve = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pnGraph = new javax.swing.JPanel();
        pnSolution = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(750, 400));

        pnButton.setName("pnButton"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(dijkstra.DijkstraApp.class).getContext().getResourceMap(DijkstraView.class);
        btnNode.setText(resourceMap.getString("btnNode.text")); // NOI18N
        btnNode.setName("btnNode"); // NOI18N

        btnEdge.setText(resourceMap.getString("btnEdge.text")); // NOI18N
        btnEdge.setName("btnEdge"); // NOI18N

        btnStart.setText(resourceMap.getString("btnStart.text")); // NOI18N
        btnStart.setName("btnStart"); // NOI18N

        btnEnd.setText(resourceMap.getString("btnEnd.text")); // NOI18N
        btnEnd.setName("btnEnd"); // NOI18N

        btnStep.setText(resourceMap.getString("btnStep.text")); // NOI18N
        btnStep.setName("btnStep"); // NOI18N

        btnSolve.setText(resourceMap.getString("btnSolve.text")); // NOI18N
        btnSolve.setName("btnSolve"); // NOI18N

        btnClear.setText(resourceMap.getString("btnClear.text")); // NOI18N
        btnClear.setName("btnClear"); // NOI18N

        javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
        pnButton.setLayout(pnButtonLayout);
        pnButtonLayout.setHorizontalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNode, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnSolve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStep, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnEdge, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnButtonLayout.setVerticalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnNode, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEdge, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnStep, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSolve, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pnGraph.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Graph", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, null));
        pnGraph.setName("pnGraph"); // NOI18N

        javax.swing.GroupLayout pnGraphLayout = new javax.swing.GroupLayout(pnGraph);
        pnGraph.setLayout(pnGraphLayout);
        pnGraphLayout.setHorizontalGroup(
            pnGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        pnGraphLayout.setVerticalGroup(
            pnGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        pnSolution.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solution", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, null));
        pnSolution.setName("pnSolution"); // NOI18N

        javax.swing.GroupLayout pnSolutionLayout = new javax.swing.GroupLayout(pnSolution);
        pnSolution.setLayout(pnSolutionLayout);
        pnSolutionLayout.setHorizontalGroup(
            pnSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        pnSolutionLayout.setVerticalGroup(
            pnSolutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnGraph, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSolution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBar.setName("menuBar"); // NOI18N

        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(dijkstra.DijkstraApp.class).getContext().getActionMap(DijkstraView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setComponent(mainPanel);
        setMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdge;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnNode;
    private javax.swing.JButton btnSolve;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStep;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnGraph;
    private javax.swing.JPanel pnSolution;
    // End of variables declaration//GEN-END:variables

    private JDialog aboutBox;
}

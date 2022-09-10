
package dynamictreedemoproyect;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
//Este evento de alto nivel es generado por un componente (como un Botón) cuando se produce la acción específica del componente (como ser presionado). El evento se pasa a cada objeto ActionListener que se ha registrado para recibir dichos eventos utilizando el método addActionListener del componente.
import java.awt.event.ActionEvent;
//La interfaz de escucha para recibir eventos de acción
import java.awt.event.ActionListener;
//https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
// is a general-purpose node in a tree data structure. For examples of using default mutable tree nodes, see How to Use Trees in The Java Tutorial.
import javax.swing.tree.DefaultMutableTreeNode;

public class DynamicTreeDemoProyect extends JPanel implements ActionListener {
    private int newNodeSuffix = 1;
    private static String ADD_COMMAND = "add";
    private static String REMOVE_COMMAND = "remove";
    private static String CLEAR_COMMAND = "clear";
    
    private DynamicTree treePanel;

    public DynamicTreeDemoProyect() {
        super(new BorderLayout());
        
        //Crear los componentes.
        treePanel = new DynamicTree();
        populateTree(treePanel);

        JButton addButton = new JButton("Agregar");
        addButton.setActionCommand(ADD_COMMAND);
        addButton.addActionListener(this);
        
        JButton removeButton = new JButton("Remover");
        removeButton.setActionCommand(REMOVE_COMMAND);
        removeButton.addActionListener(this);
        
        JButton clearButton = new JButton("Limpiar");
        clearButton.setActionCommand(CLEAR_COMMAND);
        clearButton.addActionListener(this);

        //Exponer todo lo demás.
        treePanel.setPreferredSize(new Dimension(300, 150));
        add(treePanel, BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(0,3));
        panel.add(addButton);
        panel.add(removeButton); 
        panel.add(clearButton);
	add(panel, BorderLayout.SOUTH);
    }

    public void populateTree(DynamicTree treePanel) {
        String p1Name = new String("Papa 1");
        String p2Name = new String("Papa 2");
        String c1Name = new String("hijo 1");
        String c2Name = new String("hijo 2");

        DefaultMutableTreeNode p1, p2;

        p1 = treePanel.addObject(null, p1Name);
        p2 = treePanel.addObject(null, p2Name);

        treePanel.addObject(p1, c1Name, false);
        treePanel.addObject(p1, c2Name);

        treePanel.addObject(p2, c1Name);
        treePanel.addObject(p2, c2Name);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (ADD_COMMAND.equals(command)) {
        //Añadir botón pulsado
            treePanel.addObject("Nuevo Nodo " + newNodeSuffix++);
        } else if (REMOVE_COMMAND.equals(command)) {
        //Remover botón pulsado
            treePanel.removeCurrentNode();
        } else if (CLEAR_COMMAND.equals(command)) {
         //Limpiar botón pulsado
            treePanel.clear();
        }
    }

    /**
     -- Crear la interfaz gráfica de usuario y mostrarlo.  
          Para la seguridad del hilo, este método debe ser invocado desde el
          hilo de envío de evento.
     */
    private static void createAndShowGUI() {
        //Crear y configurar la ventana.
        JFrame frame = new JFrame("Arbol de trabajo Dinamico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear y configurar el panel de contenido.
        DynamicTreeDemoProyect newContentPane = new DynamicTreeDemoProyect();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

         //Mostrar la ventana.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Programe un trabajo para el subproceso de despacho de eventos:
        //creando y mostrando la GUI de esta aplicación.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

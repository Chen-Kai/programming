Swing有它自己的专有的线程（即UI线程）来接受UI事件并更新屏幕。应该向Android一样，只在UI线程更新UI：
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
				// UI线程
                label.setText(new Date().toString());
            }
        });
p.s. 在我的机器上UI线程的名称：[AWT-EventQueue-0,6,main]

BorderLayout 东西南北中，拉伸
FlowLayout 流布局，所有组件压缩至最小，根据窗口的大小自动摆放控件
GridLayout 从左到右，从上到下添加，拉伸
BoxLayout

JFrame
JButton
JLable
JTextField	// 单行文本
JTextArea	// 多行文本，可append()
new JScrollPane(new JTextArea(100, 500))
JDialog
JPanel



 



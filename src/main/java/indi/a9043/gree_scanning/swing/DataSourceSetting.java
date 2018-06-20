package indi.a9043.gree_scanning.swing;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import indi.a9043.gree_scanning.util.AESUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class DataSourceSetting {
    private JTextField ipField;
    private JTextField portField;
    private JTextField dbNameField;
    private JTextField userNameField;
    private JPasswordField userPwdField;
    private JButton enterButton;
    private JPanel mainPanel;

    public DataSourceSetting() {
        portField.setText("1433");
        dbNameField.setText("guangma");
        userNameField.setText("sa");
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ipField.getText() == null ||
                        portField.getText() == null ||
                        dbNameField.getText() == null ||
                        userNameField.getText() == null ||
                        userPwdField.getPassword() == null ||
                        ipField.getText().equals("") ||
                        portField.getText().equals("") ||
                        dbNameField.getText().equals("") ||
                        userNameField.getText().equals("") ||
                        userPwdField.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(mainPanel, "配置不能为空! ", "Warn", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                JSONObject jsonObject = new JSONObject();
                jsonObject.put("db_ip", ipField.getText());
                jsonObject.put("db_port", portField.getText());
                jsonObject.put("db_name", dbNameField.getText());
                jsonObject.put("db_username", userNameField.getText());
                jsonObject.put("db_password", String.valueOf(userPwdField.getPassword()));
                File file = new File(System.getProperty("user.dir") + File.separator + "db.set");
                if (!file.exists()) {
                    try {
                        if (!file.createNewFile()) {
                            JOptionPane.showMessageDialog(mainPanel, "文件错误, 请手动设置!", "Error", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(mainPanel, "文件错误, 请手动设置!", "Error", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                        e1.printStackTrace();
                    }
                }

                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    String data = AESUtil.encrypt(jsonObject.toString());
                    fileOutputStream.write(data.getBytes());
                    fileOutputStream.close();
                    JOptionPane.showMessageDialog(mainPanel, "修改成功下次启动生效!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(12, 3, new Insets(20, 20, 20, 20), 5, 5));
        final JLabel label1 = new JLabel();
        label1.setText("ip");
        mainPanel.add(label1, new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        mainPanel.add(spacer1, new GridConstraints(11, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        ipField = new JTextField();
        mainPanel.add(ipField, new GridConstraints(1, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setText("port");
        mainPanel.add(label2, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        portField = new JTextField();
        mainPanel.add(portField, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label3 = new JLabel();
        label3.setText("db_name");
        mainPanel.add(label3, new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        dbNameField = new JTextField();
        mainPanel.add(dbNameField, new GridConstraints(5, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        userNameField = new JTextField();
        mainPanel.add(userNameField, new GridConstraints(7, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label4 = new JLabel();
        label4.setText("db_username");
        mainPanel.add(label4, new GridConstraints(6, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        userPwdField = new JPasswordField();
        mainPanel.add(userPwdField, new GridConstraints(9, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        final JLabel label5 = new JLabel();
        label5.setText("db_password");
        mainPanel.add(label5, new GridConstraints(8, 0, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        enterButton = new JButton();
        enterButton.setText("确定");
        mainPanel.add(enterButton, new GridConstraints(11, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        mainPanel.add(spacer2, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        mainPanel.add(panel1, new GridConstraints(10, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, new Dimension(-1, 5), new Dimension(-1, 5), new Dimension(-1, 5), 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
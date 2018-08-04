package cn.com.kieran.plugin.codemaker.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * TODO
 *
 * @author zhengk
 * @version V1.0
 * @since 2018-08-03 16:54
 */
public class CodeMakerPopMenuAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Project project = e.getData(PlatformDataKeys.PROJECT);

        String title = "标题";
        String msg = "2018,起航111";
        System.out.println("title:" + title + ",msg:" + msg);

        Messages.showMessageDialog(project, msg, title, Messages.getInformationIcon());
    }
}

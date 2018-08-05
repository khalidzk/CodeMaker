/*
 * Copyright (c) 2001-2018 Kieran.com.cn. All rights reserved.
 * Kieran 732060461@qq.com
 */
package cn.com.kieran.plugin.codemaker.action;

import com.intellij.ide.IdeView;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiDirectory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.com.kieran.plugin.codemaker.ui.JdbcInfoDialo;

/**
 * 右键菜单弹出菜单
 *
 * @author Kieran
 * @version V1.0
 * @since 2018-08-03 16:54
 */
public class CodeMakerPopMenuAction extends AnAction {
    private static final Logger LOGGER = LoggerFactory.getLogger(CodeMakerPopMenuAction.class);

    /**
     * 执行插件的入口，相当于java中的main方法
     *
     * @param anActionEvent
     */
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        IdeView ideView = anActionEvent.getRequiredData(LangDataKeys.IDE_VIEW);
        PsiDirectory directory = ideView.getOrChooseDirectory();
        LOGGER.error(directory.getName());
        System.out.println(directory.getName());

        // 获取当前的project对象
        Project project = anActionEvent.getProject();
        String projectBasePath = project.getBasePath();
        showHintDialog(projectBasePath);
    }

    /**
     * 显示提示对话框
     */
    private void showHintDialog(String projectBasePath) {
        JdbcInfoDialo dialog = new JdbcInfoDialo(projectBasePath);
        dialog.setSize(600, 400);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.requestFocus();
        dialog.pack();
    }
}

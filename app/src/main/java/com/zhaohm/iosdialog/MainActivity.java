package com.zhaohm.iosdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import view.Mdialog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //不显示系统的标题栏,
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
    }

    /**
     * 设置退出账号按钮弹出对话框
     *
     * @param view
     */
    public void OnExitNumber(View view){
        final Mdialog mdialog = new Mdialog(this);
        mdialog.setOnExitListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(mdialog.isShowing()){
                    mdialog.dismiss();
                    finish();
                }
            }
        });
        mdialog.setOnCancelListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mdialog != null && mdialog.isShowing()){
                    mdialog.dismiss();
                }
            }
        });
        mdialog.show();
    }

    public void OnUpdate(View view) {
        final Mdialog mdialog = new Mdialog(this);
        mdialog.setOnExitListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(mdialog.isShowing()){
                    mdialog.dismiss();
                    finish();
                }
            }
        });
        mdialog.setOnCancelListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mdialog != null && mdialog.isShowing()){
                    mdialog.dismiss();
                }
            }
        });
        mdialog.setTv("发现新版本，继续升级将退出本App，是否继续？");
        mdialog.show();
    }
}

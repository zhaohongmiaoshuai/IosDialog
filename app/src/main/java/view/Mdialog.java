package view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhaohm.iosdialog.R;

public class Mdialog extends Dialog {
    TextView tv;
    Button button_cancel;
    Button button_exit;

    //自定义构造方法
    public Mdialog(Context context) {
        super(context, R.style.mdialog);

        //通过LayoutInflater获取布局
        View view = LayoutInflater.from(getContext()).
                inflate(R.layout.mdialoglayout, null);

        //获取显示标题的文本框控件
        tv = (TextView) view.findViewById(R.id.title);

        //获取取消按钮
        button_cancel = (Button) view.findViewById(R.id.btn_cancel);

        //获取确认退出按钮
        button_exit = (Button) view.findViewById(R.id.btn_exit);

        //设置显示视图
        setContentView(view);
    }

    //设置显示标题文字
    public void setTv(String content) {
        tv.setText(content);
    }

    //"取消"按钮的监听方法
    public void setOnCancelListener(View.OnClickListener listener) {
        button_cancel.setOnClickListener(listener);
    }

    //"退出"按钮的监听方法
    public void setOnExitListener(View.OnClickListener listener) {
        button_exit.setOnClickListener(listener);
    }
}

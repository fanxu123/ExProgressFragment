package me.fanxu.progressfragment.ex.states;

import android.view.View;
import android.view.animation.Animation;

/**
 * by fanxu
 */
public interface ShowState {

    /**
     * ��ʾ��״̬
     * @param animate �Ƿ񶯻�
     */
    public void show(boolean animate);

    /**
     * ���ظ�״̬
     * @param animate �Ƿ񶯻�
     */
    public void dismiss(boolean animate);

    /**
     * ����FragmentView
     * @param fragmentView
     */
    public void setFragmentView(View fragmentView);

    /**
     * ���붯��
     * @param in
     */
    public void setAnimIn(Animation in);

    /**
     * �˳�����
     * @param out
     */
    public void setAnimOut(Animation out);
}

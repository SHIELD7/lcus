package site.imcu.lcus.Score;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import site.imcu.lcus.R;

/**
 * Created by mengh on 2017/8/9.
 */

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder> {

    private List<Score> mScoreList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView courseNameView;
        TextView creditView;
        TextView courseAttrView;
        TextView markView;
        TextView positionView;

        private ViewHolder(View view){
            super(view);
            courseNameView=(TextView)view.findViewById(R.id.item_name);
            creditView=(TextView)view.findViewById(R.id.item_credit);
            courseAttrView=(TextView)view.findViewById(R.id.item_attr);
            markView=(TextView)view.findViewById(R.id.item_mark);
            positionView=(TextView)view.findViewById(R.id.item_position);
        }
    }
    public ScoreAdapter(List<Score> scoreList){
        mScoreList=scoreList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.score_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return  holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        Score score = mScoreList.get(position);
        holder.courseNameView.setText(score.getCourseName());
        holder.creditView.setText(score.getCredit());
        holder.courseAttrView.setText(score.getCourseAttr());
        holder.markView.setText(score.getMark());
        holder.positionView.setText(score.getPosition());
    }
    @Override
    public int getItemCount(){
        return mScoreList.size();
    }
}

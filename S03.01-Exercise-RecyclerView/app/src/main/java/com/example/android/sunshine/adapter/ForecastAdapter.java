package com.example.android.sunshine.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.android.sunshine.R;
import java.util.zip.Inflater;
import org.w3c.dom.Text;

/**
 * Created by Richard Hrmo.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

  private String[] mWeatherData;

  public ForecastAdapter(){}

  @Override
  public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.forecast_list_item, parent, false);
    return new ForecastAdapterViewHolder(view);
  }

  @Override
  public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
    holder.mWeatherTextView.setText(mWeatherData[position]);
  }

  @Override
  public int getItemCount() {
    if (mWeatherData == null)
      return 0;
    else
      return mWeatherData.length;
  }

  public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {

    private final TextView mWeatherTextView;

    public ForecastAdapterViewHolder(View itemView) {
      super(itemView);
      mWeatherTextView = (TextView) itemView.findViewById(R.id.tv_weather_data);
    }
  }

  public void setWeatherData(String[] weatherData) {
    mWeatherData = weatherData;
    notifyDataSetChanged();
  }
}

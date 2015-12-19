package luoqi.miyu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;

public class CFrag extends Fragment {
	private WebView webview;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		View v=new View(getActivity());
		v.setLayoutParams(params);
		v.setBackgroundResource(android.R.color.holo_purple);
		return  inflater.inflate(R.layout.c, container, false);
	}
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		setView();
		setListener();
		super.onActivityCreated(savedInstanceState);
	}




	private void setListener() {
		// TODO Auto-generated method stub
		webview.loadUrl("http://weibo.cn/chen7945");

		webview.setWebViewClient(new WebViewClient(){
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return true;
			}
		});

	}




	private void setView() {
		// TODO Auto-generated method stub
		webview=(WebView)getView().findViewById(R.id.webView3);

	}

}
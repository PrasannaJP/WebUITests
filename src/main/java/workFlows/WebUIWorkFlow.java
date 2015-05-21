package workFlows;

import com.webuiframework.Page.Page;

public class WebUIWorkFlow {
	private Page _page;
	
	public WebUIWorkFlow(){
		_page = new Page();
	}
	
	public void OpenApplication(){
		_page.GotoPage();
	}
	

}

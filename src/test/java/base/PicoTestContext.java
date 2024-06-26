package base;

import pages.PageObjectManager;

public class PicoTestContext {
	
	//POJO --> Plain Old Java Object
	private BrowserFactory browserFactory;
	private PageObjectManager pageObjectManager;
	
	public PicoTestContext() {
		browserFactory = new BrowserFactory();
		pageObjectManager = new PageObjectManager(browserFactory.launchBrowser());
	}

	public BrowserFactory getBrowserFactory() {
		return browserFactory;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
}

package com.HelperReader.org;



public class FileReaderManager {
	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager fr = new FileReaderManager();
		return fr;

	}
	
	public config_reader getInsctanceCR() throws Throwable {
		config_reader cr = new config_reader();
		return cr;

	}
}

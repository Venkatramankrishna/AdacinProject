package com.properties;

import java.io.IOException;

public class Frm {
	private Frm() {
	}

	public static Frm getInstancefrm() {
		Frm fr = new Frm();
		return fr;
	}

	public Config getInstancecfg() throws IOException {
		Config cf = new Config();
		return cf;
	}
}

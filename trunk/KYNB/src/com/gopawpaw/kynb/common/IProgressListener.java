package com.gopawpaw.kynb.common;

public interface IProgressListener {
	void onBefore(int size);
	void onExecute(int n);
}

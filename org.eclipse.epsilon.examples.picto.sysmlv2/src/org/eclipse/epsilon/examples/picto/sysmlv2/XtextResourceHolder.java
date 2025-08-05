package org.eclipse.epsilon.examples.picto.sysmlv2;

import org.eclipse.xtext.resource.XtextResource;

public class XtextResourceHolder {

	protected XtextResource resource;
	protected boolean set = false;

	public XtextResource getResource() {
		while (!set) {
			try {
				wait(100);
			} catch (InterruptedException e) {
			}
		}
		return resource;
	}

	public void setResource(XtextResource resource) {
		this.resource = resource;
		set = true;
	}

}
package com.tistory.eclipse4j.expedia.api;

import java.net.URI;

import org.springframework.http.HttpEntity;

public interface ExpediaRestParameter {

	URI url();

	HttpEntity<?> headers();
}

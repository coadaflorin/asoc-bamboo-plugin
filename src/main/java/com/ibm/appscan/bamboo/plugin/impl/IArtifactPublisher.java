/**
 * (c) Copyright IBM Corporation 2016.
 * LICENSE: Apache License, Version 2.0 https://www.apache.org/licenses/LICENSE-2.0
 */

package com.ibm.appscan.bamboo.plugin.impl;

import java.io.File;

import com.atlassian.bamboo.task.TaskContext;

public interface IArtifactPublisher {
	
	void publishArtifact(TaskContext taskContext, String name, File directory, String pattern);
}
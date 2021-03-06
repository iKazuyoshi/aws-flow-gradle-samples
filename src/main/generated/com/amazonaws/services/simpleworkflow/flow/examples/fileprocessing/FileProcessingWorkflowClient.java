/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link FileProcessingWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link FileProcessingWorkflowClientExternal} instead.
 */
public interface FileProcessingWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(String sourceBucketName, String sourceFilename, String targetBucketName, String targetFilename);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(String sourceBucketName, String sourceFilename, String targetBucketName, String targetFilename, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(String sourceBucketName, String sourceFilename, String targetBucketName, String targetFilename, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(Promise<String> sourceBucketName, Promise<String> sourceFilename, Promise<String> targetBucketName, Promise<String> targetFilename);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(Promise<String> sourceBucketName, Promise<String> sourceFilename, Promise<String> targetBucketName, Promise<String> targetFilename, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.fileprocessing.FileProcessingWorkflow#processFile}
     */
    Promise<Void> processFile(Promise<String> sourceBucketName, Promise<String> sourceFilename, Promise<String> targetBucketName, Promise<String> targetFilename, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}
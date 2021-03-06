/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.splitmerge;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow}. 
 * Used to invoke child workflows asynchronously from parent workflow code.
 * Created through {@link AverageCalculatorWorkflowClientFactory#getClient}.
 * <p>
 * When running outside of the scope of a workflow use {@link AverageCalculatorWorkflowClientExternal} instead.
 */
public interface AverageCalculatorWorkflowClient extends WorkflowClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(String bucketName, String fileName, int numberOfWorkers);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(String bucketName, String fileName, int numberOfWorkers, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(String bucketName, String fileName, int numberOfWorkers, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(Promise<String> bucketName, Promise<String> fileName, Promise<Integer> numberOfWorkers);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(Promise<String> bucketName, Promise<String> fileName, Promise<Integer> numberOfWorkers, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.splitmerge.AverageCalculatorWorkflow#average}
     */
    Promise<Void> average(Promise<String> bucketName, Promise<String> fileName, Promise<Integer> numberOfWorkers, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

}
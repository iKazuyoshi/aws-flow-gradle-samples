/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.helloworld;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow}. 
 * Used to continue a workflow execution as a new run.
 * Must be used from a worklfow scope. 
 */
public interface HelloWorldWorkflowSelfClient extends WorkflowSelfClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(String name);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(String name, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(String name, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(Promise<String> name);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(Promise<String> name, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(Promise<String> name, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}
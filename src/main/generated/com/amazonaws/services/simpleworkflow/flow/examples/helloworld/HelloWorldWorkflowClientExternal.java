/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.helloworld;

import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternal;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow}. 
 * Used to start workflow executions or send signals from outside of the scope of a workflow.
 * Created through {@link HelloWorldWorkflowClientExternalFactory#getClient}.
 * <p>
 * When starting child workflow from a parent workflow use {@link HelloWorldWorkflowClient} instead.
 */
public interface HelloWorldWorkflowClientExternal extends WorkflowClientExternal
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(String name);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.helloworld.HelloWorldWorkflow#helloWorld}
     */
    void helloWorld(String name, StartWorkflowOptions optionsOverride);
}
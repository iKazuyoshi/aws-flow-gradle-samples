/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.hellolambda;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowClientExternalBase;
import com.amazonaws.services.simpleworkflow.flow.generic.GenericWorkflowClientExternal;
import com.amazonaws.services.simpleworkflow.model.WorkflowExecution;
import com.amazonaws.services.simpleworkflow.model.WorkflowType;

class HelloLambdaWorkflowClientExternalImpl extends WorkflowClientExternalBase implements HelloLambdaWorkflowClientExternal {

    public HelloLambdaWorkflowClientExternalImpl(WorkflowExecution workflowExecution, WorkflowType workflowType, 
            StartWorkflowOptions options, DataConverter dataConverter, GenericWorkflowClientExternal genericClient) {
        super(workflowExecution, workflowType, options, dataConverter, genericClient);
    }

    @Override
    public void helloWorld(String name) { 
        helloWorld(name, null);
    }

    @Override
    public void helloWorld(String name, StartWorkflowOptions startOptionsOverride) {
    
        Object[] _arguments_ = new Object[1]; 
        _arguments_[0] = name;
        dynamicWorkflowClient.startWorkflowExecution(_arguments_, startOptionsOverride);
    }


}
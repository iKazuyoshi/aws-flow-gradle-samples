/*
 * This code was generated by AWS Flow Framework Annotation Processor.
 * Refer to Amazon Simple Workflow Service documentation at http://aws.amazon.com/documentation/swf 
 *
 * Any changes made directly to this file will be lost when 
 * the code is regenerated.
 */
 package com.amazonaws.services.simpleworkflow.flow.examples.booking;

import com.amazonaws.services.simpleworkflow.flow.core.Promise;
import com.amazonaws.services.simpleworkflow.flow.StartWorkflowOptions;
import com.amazonaws.services.simpleworkflow.flow.WorkflowSelfClient;

/**
 * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow}. 
 * Used to continue a workflow execution as a new run.
 * Must be used from a worklfow scope. 
 */
public interface BookingWorkflowSelfClient extends WorkflowSelfClient
{

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(int requestID, int customerID, boolean reserveAir, boolean reserveCar);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(int requestID, int customerID, boolean reserveAir, boolean reserveCar, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(int requestID, int customerID, boolean reserveAir, boolean reserveCar, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(Promise<Integer> requestID, Promise<Integer> customerID, Promise<Boolean> reserveAir, Promise<Boolean> reserveCar);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(Promise<Integer> requestID, Promise<Integer> customerID, Promise<Boolean> reserveAir, Promise<Boolean> reserveCar, Promise<?>... waitFor);

    /**
     * Generated from {@link com.amazonaws.services.simpleworkflow.flow.examples.booking.BookingWorkflow#makeBooking}
     */
    void makeBooking(Promise<Integer> requestID, Promise<Integer> customerID, Promise<Boolean> reserveAir, Promise<Boolean> reserveCar, StartWorkflowOptions optionsOverride, Promise<?>... waitFor);
}
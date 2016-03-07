# AWS Simpleworkflow Samples

## Modified
- samples-aws-flowframework/src/test/java/com/amazonaws/services/simpleworkflow/flow/examples/booking/BookingWorklfowTest.java
```
/samples-aws-flowframework/src/test/java/com/amazonaws/services/simpleworkflow/flow/examples/booking/BookingWorklfowTest.java
17,19c17,20
< import java.util.ArrayList;
< import java.util.List;
<
---
> import com.amazonaws.services.simpleworkflow.flow.core.Promise;
> import com.amazonaws.services.simpleworkflow.flow.junit.AsyncAssert;
> import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
> import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;
26,29c27,28
< import com.amazonaws.services.simpleworkflow.flow.core.Promise;
< import com.amazonaws.services.simpleworkflow.flow.junit.AsyncAssert;
< import com.amazonaws.services.simpleworkflow.flow.junit.FlowBlockJUnit4ClassRunner;
< import com.amazonaws.services.simpleworkflow.flow.junit.WorkflowTest;
---
> import java.util.ArrayList;
> import java.util.List;
37c36
<     List<String> trace;
---
>     List<String> trace = new ArrayList<>();
43c42
<         trace = new ArrayList<String>();
---
>         trace.clear();
69d67
<         trace = null;

```


/*
Concept of Parameters

If a subroutine is a black box, then a parameter is something that provides a mechanism for passing information from the outside world into the box.
Parameters are part of the interface of a subroutine. They allow you to customize the behavior of a subroutine to adapt it to a particular situation.

In my opinion, parameters are something that made the output and workflow of a subroutine dynamic, allowing the subroutine to complete the task depending on
the value we pass to that subroutine. Parameters can be used to dynamically execute the subroutine and they can help to get the dynamic output instead of constant ones.


Formal Parameters

Parameters in a subroutine definition are called formal parameters or dummy parameters. A formal parameter must be a name, that is, a simple identifier.
A formal parameter is very much like a variable, and—like a variable—it has a specified type such as int, boolean, String, or double[].


Actual Parameters

The parameters that are passed to a subroutine when it is called are called actual parameters or arguments. An actual parameter is a value, and so it can be specified by any expression, provided
that the expression computes a value of the correct type. The type of the actual parameter must be one that could legally be assigned to the formal parameter with an assignment statement. For example,
if the formal parameter is of type double, then it would be legal to pass an int as the actual parameter since ints can legally be assigned to doubles. When you call a subroutine, you must provide one actual
parameter for each formal parameter in the subroutine’s definition



*/


class DiscussionUnit3{
    public static void main(String[] args) {

        String actualParameter = "Java Programming Language";
        illustrateFormalAndActualParameters(actualParameter);
        // variable 'actualParameter' is passed as an Actual Parameter for the subroutine 'illustrateFormalAndActualParameters'
    }

    private static void illustrateFormalAndActualParameters(String formalParameter) {
        /* 'formalParameter' is working as a formal parameter of a subroutine. When this subroutine is called, actual parameter in subroutine call
        statements are evaluated and the values are assigned to the formal parameters of the subroutine's definition*/

        System.out.println("I Love " + formalParameter);
    }
}


/*
Reference
David J.Eck. (2022, May). Javanotes 9, Section 2
Java Application. Introduction to Programming Using Java. https://math.hws.edu/javanotes/c2/s1.html
*/

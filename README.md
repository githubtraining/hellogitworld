# Git Bisect Example

## Instructions

To run the demo:

    git bisect start
    git bisect bad
    git bisect good HEAD~11
    git bisect run mvn test

To display results in text form:

    git bisect log

To display results in GitK:

    git bisect visualize

To start over:

    git bisect reset

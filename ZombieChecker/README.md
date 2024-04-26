**any questions or clarifications you would like to have asked of the client who needs this code**
Can you provide a comprehensive list of zombie types and their associated weaknesses?
Are there any specific characteristics or attributes of each zombie type that should be considered?
What are some potential edge cases or special scenarios that should be handled in the program? 
For example, how should the program behave when encountering invalid input or non-existing zombie types?
**any design decisions or assumptions you made in order to write the code**
 I chose to define an interface (ZombieAPI) to abstract the interaction with the external zombie database. This allows for flexibility in implementing different versions of the zombie API, such as a mock implementation for testing or a production implementation for real-world use.
 I utilized dependency injection in the ZombieIdentifier class by passing an instance of ZombieAPI through its constructor. This design pattern allows for loose coupling between classes and facilitates easier testing and maintenance.
 For testing I am currently in the class CS395 Software Testing, I learned how to do Mutation Testing. This type of testing is good in small programs and I felt it was perfect to implement this type of testing in this program.
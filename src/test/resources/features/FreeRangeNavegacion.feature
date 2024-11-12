@Navigation
Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links

    # Pre step para cada Scenario, intentar que no sean mas de dos
    Background: I am on the Free Range Testers web without logging in.
        Given I navigate to www.freerangetesters.com

    #Scenarios
    Scenario Outline: I can access the subpages through the navigation bar
         When I go to <section> using the navigation bar
         Examples:
             | section    |
             | Cursos     |
             | Recursos   |
             | Blog       |
             | Mentorías  |
             | Udemy      |

    @Courses
    Scenario: Courses are presented correctly to potential customers    
        When I go to Cursos using the navigation bar
        And select Comprar ahora
    
    #Expresiones correctas: "I|The user|The client) (select|selects) Elegir Plan"
    @Plans @Courses
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the options in the checkout page    
        
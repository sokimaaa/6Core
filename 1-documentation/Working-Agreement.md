# Working Agreement
Before to start contributing familiarise yourself with working agreement below.

## Git Agreement
High remark
1. One stable branch `dev`
2. Anything on `dev` should be in ready for work status
3. Features and hotfixes branches created from `dev`
4. Merging allowed only after `Approve` and when all tests passed
5. Merge doing by the task assignee after `Approve`

### Gitflow branching strategy
The branching model that will be used in our platform would be `Gitflow Workflow`, also known as `Gitflow Branching Strategy`. 
It is a Git branching model that involves the use of feature branches and multiple primary branches.

`main branches`: This workflow uses one or more branches to record the history of the project. 
The main branch serves as an integration branch for features. All commits to this branch should be made by PR (Pull Request).
Also, this branch considered as a stable that means your new features should be well-tested and not break existing functionality.

`feature branches`: Each new feature should reside in its own branch. Feature branches use develop as their parent branch. 
When a feature is complete, it gets merged back into develop.

### Branch naming
| branch type      | pattern                       | example          | explanation                        |
|------------------|-------------------------------|------------------|------------------------------------|
| main branches    | `n\a`                         | `dev`            | fixed name                         |
| feature branches | `^feat\/[A-Za-z0-9]+-[0-9]+$` | `feat/6CORE-[username]-000` | `feat/` prefix + ticket identifier |
| hotfix branches  | `^fix\/[A-Za-z0-9]+-[0-9]+$`  | `fix/6CORE-[username]-000`  | `fix/` prefix + ticket identifier  |

### Commit naming
All commits in a repository should follow next pattern: 

`[6CORE-000] short description`

Begin with `ticked ticket` identifier in square brackets. 

Try to add only meaningful commit names. 
No need to make it very large in most cases 2-4 words enough 
to shortly describe what have been done.

### Pull Request naming
The same naming as for commit, 
but description should explain what has been done in this pull request.

Links for exploration:
- [git interactive learning](https://learngitbranching.js.org/?locale=uk)
- [gitflow atlassian](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)
- [branching strategies](https://www.youtube.com/watch?v=6BCOyrUobGc&ab_channel=VitaliShulha)

## Task Agreement
High remark
1. Tasks are going to be accessible on the Kanban-like board
2. When started working on task, it should be moved to `In Progress`
3. When task is match to DoR (Definition of Ready) criteria, it should be moved to `In Code Review`
4. When task is match to DoD (Definition of Done) criteria, it should be moved to `Done`

### TODO status
When task is received from client, it should be well-described on the board and moved in `TODO status`.
From time the task is appeared in `TODO status list`, it becomes ready to take in pool by developers.
Once developer reassigns `TODO task` to himself, he should place expected time to be moved in `In Code Review` status.
Evaluate expected time in numbers of days, e.g. `1`, `2`, `5`, `10` and so on.

### In Progress status
From the time the task is moved to `In Progress status`, counter of days is being started. 
Move to `In Progress` only after evaluating expected time and fully understand what should be done in the issue.
Expected that you should have only one ticket `In Progress` status, multitasking could be harmful at long distant.
Expected that you have exactly one ticket `In Progress` status, in case have any I could come with questions. 

### In Code Review status
Move to the `In Code Review` task that match DoR (Definition of Ready) criteria.

`DoR`:
- The implementation covers `Acceptance Criteria` (or shortly `AC`)
- The code has been successfully build, e.g. `mvn clean package`
- The code has been manually tested and works as expected
- The code has been covered with unit tests (if applicable)
- The code passed all tests (unit test, integration test and so on)
- Task ready for review, that means you fix all typos, redundant comments, styles issue, developer playground and so on.
- You created Merge Request (or Pull Request) and assign mentor as reviewer.

### Done status
Move to the `Done` task that match DoD (Definition of Done) criteria.

`DoD`:
- The code was reviewed with `Approve` by mentor
- The code was reviewed with `Approve` by at least one team member (non including mentor)
- In case of `Request changes` should be discussed and fixed all points
- Nothing was broken after changes
- The code was merged by `Assignees` to `dev`

Links for exploration:
- [software development life cycle](https://www.clouddefense.ai/system-development-life-cycle/)
- [kanban board](https://www.forbes.com/advisor/business/software/what-is-kanban-board/)
- [kanban board 2](https://kanbantool.com/kanban-board)
- [scrum board](https://www.forbes.com/advisor/business/what-is-a-scrum-board/)
- [agile sprint](https://www.atlassian.com/agile/scrum/sprints)

## Testing Agreement

## Common Architectural Agreement
To ensure code quality we need to stay consistent in architectural styles we are using. 
Let's focus on 
1. Microservices Architecture.
Microservices project structure looks like 
a set with Monolith-like project designed specifically to get pros of microservices.

2. Hexagonal Architecture.
To see `example` of hexagonal just visit [hexagonal project example](https://github.com/sokimaaa/hexagonal-project-example)

To learn more consider exploring:
- [microservices architecture overall](https://camunda.com/glossary/microservices/)
- [soa vs microservices](https://www.ibm.com/blog/soa-vs-microservices/)
- [microservices architecture and patterns](h1ttps://medium.com/design-microservices-architecture-with-patterns/microservices-architecture-problems-and-solutions-with-pattern-and-principles-b673f342dc10)
- [microservices architecture and patterns 2](https://medium.com/design-microservices-architecture-with-patterns/microservices-checklist-cover-all-aspects-of-microservices-architecture-e3243fe1a53f)
- [microservices database architecture](https://www.baeldung.com/cs/microservices-db-design)
- [microservices database per service](https://medium.com/design-microservices-architecture-with-patterns/the-database-per-service-pattern-9d511b882425)
- [hexagonal architecture](https://herbertograca.com/2017/11/16/explicit-architecture-01-ddd-hexagonal-onion-clean-cqrs-how-i-put-it-all-together/)

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
| feature branches | `^feat\/[A-Za-z0-9]+-[0-9]+$` | `feat/6CORE-000` | `feat/` prefix + ticket identifier |
| hotfix branches  | `^fix\/[A-Za-z0-9]+-[0-9]+$`  | `fix/6CORE-000`  | `fix/` prefix + ticket identifier  |

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
- [gitflow atlassian](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)
- [branching strategies]()

## Task Agreement

## Testing Agreement


# Metrix Contribution Guide

Hello! Thank you for your interest in contributing to Metrix :).

To ensure everyone has a nice experience working in the project, we wrote this document to guide you in what you should do
to write your first PR to Metrix.

First of all, please make sure to walk through the following:

- [The Code of Conduct](CODE_OF_CONDUCT.md)
- [How to open an Issue](ISSUE_TEMPLATE.md)
- [How to open a Pull Request](PULL_REQUEST_TEMPLATE.md)

Then you may check:

- [How to start contributing](#how-to-start-contributing)
- [Project Structure](#project-structure)
- [Contribution Workflow](#contribution-workflow)
- [Suggesting a new feature](#suggesting-a-new-feature)

## How to start contributing

A good way to start contributing with Metrix is to take a look at the [Open Issues](https://github.com/felipevfa/metrix-tec2/issues).
Issues tagged with "good 1st issue" are normally easy enough to fix and are good targets for your first contribution.

You can also scan our documentation for typos, or maybe for something that should be made more clear. That's also good way to
start and open your first pull request.

Finally, remember that opening issues is also a way to contribuet. If you find a bug, please open a new issue so we can take a
look at it!

## Contribution Workflow (simplified)

1. Find an issue to fix. Pick either an open issue or open one (see [suggesting a new feature](#suggesting-a-new-feature))
2. Create a branch from ```development```. You may name your branch whatever you like, but please try to give it a meaningful name (idea: name it after the issue you are fixing e.g. "issue-#4"). 
3. Commit your changes to your new branch. No need to do it in one commit, but please include a commit message indicating which issue your changes fix (add "fix #issue-number" to the message), for tracking reasons. 
4. When you are finished, open a Pull Request against the ```development``` branch and wait for review. If everything is OK, your PR will be merged! :)

For a more detailed workflow, please check this article on [Gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow), which we adopt. 

We are studying the benefits of adopting a commit message convention such as the one used by Angular and View, so we can
generate a CHANGELOG.md automatically, but at this point, just try to make the commit messages meaningful. :D

### Setting up

## Suggesting a new feature

If you want to add a new feature to Metrix, please [open an issue](https://github.com/felipevfa/metrix-tec2/issues) to see
if your idea is greenlighted, in which case you may start working on it using the simple workflow provided above.

## Project Structure

```***src***```: the location of Metrix's source code. This folder is divided into two subfolders:
  ```***main***```: the Metrix de facto source code.
  ```***test***```: the source for the tests.
```***doc***```: the location of any documentation-related files. 


Group Project
============
The QA manager will ensure that an initial structure is created. All members will check out a working copy. They will work in this
structure and commit changes to the repository as appropriate. Working copies will have any generated items (processed documents,
compiled code etc.) locally generated. Working files and directories which are not part of the final product (e.g. temporary
output files) may also be present.

The directories described below should be present and additional directories may be created as required.

* docs. This contains documents produced by the group members. Each document should be in its own directory.

* lib. This contains any third party libraries used by the project. The build file and/or the code itself ensures access to them.
This is language dependent.

* man. management documents are stored in this directory. Specifically, there should be a minutes directory and a plan directory.
The plan directory will contain the project plan document.

* src. This contains the source code for the project, arranged into the relevant directories corresponding to their position in
the package hierarchy or in other language defined arrangements. If a project requires more than one program in the system one
directory, appropriately named, may be required for each.

* test. Test code is stored in this directory. Unit tests will be stored in a structure which reflects src, and test may be a
subdirectory of src. Other test harnesses will be stored in directories related to the specific test at the top level of test.
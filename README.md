# Sort Manager Project
This is a sort manager project that was created during the fourth week of training at Sparta Global. It features three different sorting algorithms: bubble sort, merge sort, and binary tree sort. The project utilises the factory design pattern and follows the principles of SOLID and OOP. 

## Tools used in the project
This project was made using IntelliJ as the IDE. Maven was used as the dependency management tool. The dependencies used in this project are listed below:
- JUnit 5.7.0 was used for unit testing
- Apache log4j-core and log4j-api were used for logging exceptions that were thrown by the program

## User Guide
When the program is started, it will prompt the user to enter a number between 1 and 3 to select the type of sorter they would like. If the user does not select one of these numbers, an invalid input exception will be thrown and the program will exit. 

Once the user selects a valid type of sorter, they will then be prompted to enter the length of the array they want to sort. If the user inputs a negative number number, an invalid input exception will be thrown and the program will exit. 

Finally, the user will be prompted to enter either 1 or 2 to select the type of array they want to sort, where 1 represents a randomly generated array and 2 represents a user-inputted array. If the user selects another number then an invalid input exception will be thrown and the program will exit. 

If the user selected the random array option, the type of random array generated depends on the type of sorter the user selected. If the user selected the binary tree sorter, the random array will not contain any duplicates but if they selected either the buble or merge sorter, the array can contain duplicates. If the user selected the option to input their own array, they will be prompted to enter a list of numbers separated by commas. The inputted list needs to be the same size as the size of the array they entered earlier or the program will throw an invalid input exception and exit.

After the sorter has been selected and the array to sort has been created, the program will check if the array is already sorted. If it is, then the program will output a message to tell the user that the array is already sorted, and then exit. 

If the array is not already sorted, then it will be passed into the sorter method that the user selected and will be sorted. The program will output the unsorted array, followed by the sorted array, followed by the time taken to sort the array in milliseconds.

## Performance Testing results
Performance testing for each of the sorters was done for arrays of four different lengths: 
- 100 
- 1000 
- 10000 
- 100000

For each size, a random array was generated containing the numbers 0 to one minus the size (e.g. for a length of 100, the array would contain the numbers 0-99). This was to ensure there would be no duplicates so that the binary tree sorter would have to sort the same amount of numbers as the bubble and merge sorters. Each of the sorting algorithms were used on the same array and the time taken to sort the array was recorded in milliseconds.

The performance tests were repeated five times and the results are shown below:

100 elements:
- Average time taken for bubble sort: 0ms
- Average time taken for merge sort: 0ms
- Average time taken for binary tree sort: 0ms

1000 elements:
- Average time taken for bubble sort: 2ms
- Average time taken for merge sort: 0ms
- average time taken for binary tree sort: 0ms

10000 elements:
- Average time taken for bubble sort: 148ms
- Average time taken for merge sort: 2ms
- Average time taken for binary tree sort: 2ms

100000 elements:
- Average time taken for bubble sort: 18340ms
- Average time taken for merge sort: 29ms
- Average time taken for binary tree sort: 84ms

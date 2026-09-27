import java.util.Scanner;

public class BinarySearch {

// Returns index of x if it is present in arr[].

int binarysearch(int arr[], int l , int r , int x) {
if (r >= 1){

int mid = l + (r - l) / 2;

// Check if x is present at mid

if (arr[mid] == x)

return mid;

// If x is greater, ignore left half

if (arr[mid] > x)

return binarysearch(arr , l , mid - 1 , x);

// If x is smaller, ignore right half

else
return binarysearch(arr , l , mid + 1 , x);

}

// If we reach here, then element was not present

return -1;

}

public static void main(String args[]) {

Scanner scn = new Scanner(System.in);

// Prompt the user to enter the size of the array

System.out.print("Enter the number of elements in the array: ");

int n = scn.nextInt();

// Create an array and prompt the user to input its elements

int arr[] = new int[n];

System.out.println("Enter the elements of the array (sorted in ascending order):");

for (int i = 0; i < n; i++) {

arr[i] = scn.nextInt();

}

// Prompt the user to input the element to be searched

System.out.print("Enter the element to search: ");

int x = scn.nextInt();

BinarySearch ob = new BinarySearch();

int result = ob.binarysearch(arr, 0 , n - 1 , x);

// Output the result of the search

if (result == -1)

System.out.println("Element is not present in the array");

else

System.out.println("Element is present at index " + result);

}

}
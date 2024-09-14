#include <iostream>
using namespace std;

void swap(int array[],int firstIndex,int secondIndex){
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
}
int pivot(int array[],int pivotIndex,int endIndex){
    int swapIndex = pivotIndex;
    for(int i = pivotIndex + 1 ; i <= endIndex ; i++ ){
        if(array[i]<array[pivotIndex]){
            swapIndex++;
            swap(array,swapIndex,i);
        }
    }
    swap(array,pivotIndex,swapIndex);
    return swapIndex;
}

void quickSort(int array[],int leftIndex,int rightIndex){
    if(leftIndex >= rightIndex) return;

    int pivotIndex = pivot(array,leftIndex,rightIndex);
    quickSort(array,leftIndex,pivotIndex - 1);
    quickSort(array,pivotIndex+1,rightIndex);

  
}
int main(){

    int myArray[] = { 4, 6 ,1 ,7 , 3, 2, 5};
    int size = sizeof(myArray)/sizeof(myArray[0]);

    cout << "Before Sorting : " << endl;
    for(auto value : myArray){
        cout << value << " ";
    }
    
    cout << endl << endl;


    quickSort(myArray , 0 , size -1);
     cout << "After Sorting : " << endl;
    for(auto value : myArray){
        cout << value << " ";
    }
}
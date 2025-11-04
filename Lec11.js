

// 1. Spred Operator：allows us to concatenate arrays. copy arrays
//let newArray = {...oldArray}
let xArray = {{a:4,b:5}},{{a:7,b:8}};
let yArray = {...xArray,...xArray};  //...xArray is the spread

// 2. Splice Operator: remove from array
// splice(startIdx,deleteCount,newItem): .splice(2,1) = delete the first item from index 2
  let original =[
  { a:4，b:5 },
  { a:8，b:7 },
  { a:19,b:25 },
  {a:99，b:125 },
  ];
  //remove 1 element start at index 1
  let splicedResult = original.splice(1,1);

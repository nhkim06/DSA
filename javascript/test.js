MAX = 5;

// // O(n**2)
// for (let i = 0; i < MAX; i++) {
//     for (let j = 0; j < MAX; j++) {
//         console.log(j);
//     }   
// }   

// // O(n(n+1)/2)
// for (let i = 0; i < MAX; i++) {
//     for (let j = 0; j < MAX-i; j++) {
//         console.log(j);
//     }   
// }   

for (let i = 0; i < MAX-1; i++) {
    for (let j = i+1; j < MAX; j++) {
        
        console.log(j);
    }  
    console.log( 'ddddd' + String(i) ); 
}   


// O(logn)

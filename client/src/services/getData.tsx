import { useEffect, useState } from "react";
interface IBook {
  id: number;
  name: string;
  author: string;
  release_year: number;
}

const getData = (url: string) => {
    const [data, setData] = useState<Array<IBook>>([]); // type should refactor to a Generic T for reutilization
    const [error, setError] = useState(null);
    const [isLoading, setIsLoading] = useState(true);

   useEffect(()=>{
     try {
       fetch(url)
       .then((response) => response.json())
       .then((response)=>{
        setData(response);
        setIsLoading(false);
       });
     } catch (e: any) {
        setError(e);
       console.log("something went wrong", e);
     }
   }, [url])
   return {data, error, isLoading};
};
export default getData;
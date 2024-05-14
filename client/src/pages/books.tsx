import getData from "../services/getData";
interface IBook {
  id: number;
  name: string;
  author: string;
  release_year: number;
}
function Books() {
    const { data, isLoading, error } = getData("http://localhost:8080/books");
  return (
    <>
      <h1>Books</h1>
      {isLoading && <h2>Loading...</h2>}
      {error && <h2>error</h2>}
      <ul>
        {data &&
        //rename e to book, check how to render from array<IBook>
          data.map((e: IBook) => (
            <li key={e.id} id={e.id.toString()}>
              <p>
                <b>name:</b> {e.name}
              </p>
              <p>
                <b>author:</b> {e.author}
              </p>
              <p>
                <b>email:</b> {e.release_year}
              </p>
            </li>
          ))}
      </ul>
    </>
  );
}
export default Books;

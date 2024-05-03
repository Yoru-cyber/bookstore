function NavBar(){
    return (
      <>
        <nav className="flex flex-row p-2 items-center">
          <span className="flex flex-row items-center mr-5">
            <img
              width="64"
              height="64"
              src="https://img.icons8.com/external-flatart-icons-lineal-color-flatarticons/64/external-owl-halloween-flatart-icons-lineal-color-flatarticons.png"
              alt="external-owl-halloween-flatart-icons-lineal-color-flatarticons"
            />
            <h2 className="font-bold">Book Owl</h2>
          </span>
          <a href="/" className="m-2">
            Home
          </a>
          <a href="/about" className="m-2">
            About
          </a>
          <a href="/books" className="m-2">
            Books
          </a>
        </nav>
      </>
    );
}
export default NavBar;
/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./src/**/*.{html,js,svelte,ts}'],
  theme: {
    extend: {},
    fontFamily: {
      'sans': ['Ubuntu', 'sans-serif'],
      'jakarta': ['"Plus Jakarta Sans"', 'sans-serif']
    }
  },
  plugins: []
};
import { env } from '$env/dynamic/public';

/** @type {import('./$types').PageLoad} */
export async function load({params}) {
  console.log('load', params.id)
  let res = await fetch(env.PUBLIC_BACKEND_URL + '/generator/' + params.id, {
    method: 'GET'
  })
  console.log(res)
  return res.json()
}

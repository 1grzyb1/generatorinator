import {error} from '@sveltejs/kit';

/** @type {import('./$types').PageLoad} */
export async function load({params}) {
  console.log('load', params.id)
  let res = await fetch('http://grzybek.snet.ovh:9999/generator/' + params.id, {
    method: 'GET'
  })
  console.log(res)
  return res.json()
}
